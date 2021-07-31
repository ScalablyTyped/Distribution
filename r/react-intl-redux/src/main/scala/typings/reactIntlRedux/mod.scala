package typings.reactIntlRedux

import typings.reactRedux.mod.ProviderProps
import typings.redux.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-intl-redux", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-intl-redux", "IntlProvider")
  @js.native
  class IntlProvider ()
    extends typings.reactIntl.mod.IntlProvider
  
  @JSImport("react-intl-redux", "Provider")
  @js.native
  class Provider[A /* <: Action[js.Any] */] protected ()
    extends typings.reactRedux.mod.Provider[A] {
    def this(props: ProviderProps[A]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ProviderProps[A], context: js.Any) = this()
  }
  
  @scala.inline
  def intlReducer(state: Unit, action: IntlAction): IntlState = (^.asInstanceOf[js.Dynamic].applyDynamic("intlReducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[IntlState]
  @scala.inline
  def intlReducer(state: IntlState, action: IntlAction): IntlState = (^.asInstanceOf[js.Dynamic].applyDynamic("intlReducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[IntlState]
  
  @scala.inline
  def updateIntl(opts: IntlState): IntlAction = ^.asInstanceOf[js.Dynamic].applyDynamic("updateIntl")(opts.asInstanceOf[js.Any]).asInstanceOf[IntlAction]
  
  trait IntlAction
    extends StObject
       with Action[js.Any] {
    
    var payload: js.UndefOr[IntlState] = js.undefined
  }
  object IntlAction {
    
    @scala.inline
    def apply(`type`: js.Any): IntlAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntlAction]
    }
    
    @scala.inline
    implicit class IntlActionMutableBuilder[Self <: IntlAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: IntlState): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    }
  }
  
  trait IntlState extends StObject {
    
    var formats: js.UndefOr[js.Any] = js.undefined
    
    var locale: String
    
    var messages: js.Any
  }
  object IntlState {
    
    @scala.inline
    def apply(locale: String, messages: js.Any): IntlState = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntlState]
    }
    
    @scala.inline
    implicit class IntlStateMutableBuilder[Self <: IntlState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormats(value: js.Any): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessages(value: js.Any): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    }
  }
}
