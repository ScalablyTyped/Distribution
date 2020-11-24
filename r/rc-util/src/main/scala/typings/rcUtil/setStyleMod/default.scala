package typings.rcUtil.setStyleMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-util/lib/setStyle", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * Easy to set element style, return previous style
    * IE browser compatible(IE browser doesn't merge overflow style, need to set it separately)
    * https://github.com/ant-design/ant-design/issues/19393
    *
    */
  def apply(style: CSSProperties): CSSProperties = js.native
  def apply(style: CSSProperties, options: SetStyleOptions): CSSProperties = js.native
}
