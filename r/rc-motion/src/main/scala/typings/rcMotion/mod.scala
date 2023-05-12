package typings.rcMotion

import typings.rcMotion.anon.CSSMotionPropsrefRefanyun
import typings.rcMotion.anon.MotionContextPropschildre
import typings.rcMotion.esCssmotionlistMod.CSSMotionListProps
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-motion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  inline def Provider(param0: MotionContextPropschildre): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Provider")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
}
