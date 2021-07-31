package typings.rcDialog

import typings.rcDialog.idialogproptypesMod.IDialogPropTypes
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogMod {
  
  @JSImport("rc-dialog/es/Dialog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: IDialogChildProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait IDialogChildProps
    extends StObject
       with IDialogPropTypes {
    
    def getOpenCount(): Double
    
    var switchScrollingEffect: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object IDialogChildProps {
    
    @scala.inline
    def apply(getOpenCount: () => Double): IDialogChildProps = {
      val __obj = js.Dynamic.literal(getOpenCount = js.Any.fromFunction0(getOpenCount))
      __obj.asInstanceOf[IDialogChildProps]
    }
    
    @scala.inline
    implicit class IDialogChildPropsMutableBuilder[Self <: IDialogChildProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetOpenCount(value: () => Double): Self = StObject.set(x, "getOpenCount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSwitchScrollingEffect(value: () => Unit): Self = StObject.set(x, "switchScrollingEffect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSwitchScrollingEffectUndefined: Self = StObject.set(x, "switchScrollingEffect", js.undefined)
    }
  }
}
