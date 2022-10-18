package typings.rcMotion

import org.scalablytyped.runtime.Shortcut
import typings.rcMotion.anon.CSSMotionPropsrefRefanyun
import typings.rcMotion.esCssmotionlistMod.CSSMotionListProps
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ForwardRefExoticComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-motion", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[CSSMotionPropsrefRefanyun] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rc-motion", "CSSMotionList")
  @js.native
  open class CSSMotionList protected () extends Component[CSSMotionListProps, Any, Any] {
    def this(props: CSSMotionListProps) = this()
    def this(props: CSSMotionListProps, context: Any) = this()
  }
  @JSImport("rc-motion", "CSSMotionList")
  @js.native
  val CSSMotionList: ComponentClass[CSSMotionListProps, Any] = js.native
  
  type _To = ForwardRefExoticComponent[CSSMotionPropsrefRefanyun]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ForwardRefExoticComponent[CSSMotionPropsrefRefanyun] = default
}
