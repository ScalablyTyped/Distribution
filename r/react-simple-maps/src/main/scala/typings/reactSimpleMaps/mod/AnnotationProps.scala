package typings.reactSimpleMaps.mod

import typings.react.mod.ClassAttributes
import typings.react.mod.SVGAttributes
import typings.react.mod.SVGProps
import typings.std.SVGGElement
import typings.std.SVGPathElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationProps
  extends SVGAttributes[SVGGElement]
     with ClassAttributes[SVGGElement] {
  
  var connectorProps: SVGProps[SVGPathElement] = js.native
  
  /**
    * @default 0
    */
  var curve: js.UndefOr[Double] = js.native
  
  var subject: js.UndefOr[Point] = js.native
}
object AnnotationProps {
  
  @scala.inline
  def apply(connectorProps: SVGProps[SVGPathElement]): AnnotationProps = {
    val __obj = js.Dynamic.literal(connectorProps = connectorProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationProps]
  }
  
  @scala.inline
  implicit class AnnotationPropsOps[Self <: AnnotationProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConnectorProps(value: SVGProps[SVGPathElement]): Self = this.set("connectorProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurve(value: Double): Self = this.set("curve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurve: Self = this.set("curve", js.undefined)
    
    @scala.inline
    def setSubject(value: Point): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
  }
}
