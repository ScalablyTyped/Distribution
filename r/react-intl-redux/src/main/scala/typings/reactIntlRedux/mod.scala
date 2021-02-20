package typings.reactIntlRedux

import typings.reactRedux.mod.ProviderProps
import typings.redux.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-intl-redux", "IntlProvider")
  @js.native
  class IntlProvider ()
    extends typings.reactIntl.mod.IntlProvider
  
  @JSImport("react-intl-redux", "Provider")
  @js.native
  class Provider[A /* <: Action[_] */] protected ()
    extends typings.reactRedux.mod.Provider[A] {
    def this(props: ProviderProps[A]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ProviderProps[A], context: js.Any) = this()
  }
  
  @JSImport("react-intl-redux", "intlReducer")
  @js.native
  def intlReducer(state: js.UndefOr[scala.Nothing], action: IntlAction): IntlState = js.native
  @JSImport("react-intl-redux", "intlReducer")
  @js.native
  def intlReducer(state: IntlState, action: IntlAction): IntlState = js.native
  
  @JSImport("react-intl-redux", "updateIntl")
  @js.native
  def updateIntl(opts: IntlState): IntlAction = js.native
  
  @js.native
  trait IntlAction
    extends Action[js.Any] {
    
    var payload: js.UndefOr[IntlState] = js.native
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
  
  @js.native
  trait IntlState extends StObject {
    
    var formats: js.UndefOr[js.Any] = js.native
    
    var locale: String = js.native
    
    var messages: js.Any = js.native
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
