package typings.reactIntlRedux

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
  open class IntlProvider ()
    extends typings.reactIntl.mod.IntlProvider
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReduxProvider<A> * / any */ @JSImport("react-intl-redux", "Provider")
  @js.native
  open class Provider[A /* <: Action[Any] */] () extends StObject
  
  inline def intlReducer(state: Unit, action: IntlAction): IntlState = (^.asInstanceOf[js.Dynamic].applyDynamic("intlReducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[IntlState]
  inline def intlReducer(state: IntlState, action: IntlAction): IntlState = (^.asInstanceOf[js.Dynamic].applyDynamic("intlReducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[IntlState]
  
  inline def updateIntl(opts: IntlState): IntlAction = ^.asInstanceOf[js.Dynamic].applyDynamic("updateIntl")(opts.asInstanceOf[js.Any]).asInstanceOf[IntlAction]
  
  trait IntlAction
    extends StObject
       with Action[Any] {
    
    var payload: js.UndefOr[IntlState] = js.undefined
  }
  object IntlAction {
    
    inline def apply(`type`: Any): IntlAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntlAction]
    }
    
    extension [Self <: IntlAction](x: Self) {
      
      inline def setPayload(value: IntlState): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    }
  }
  
  trait IntlState extends StObject {
    
    var formats: js.UndefOr[Any] = js.undefined
    
    var locale: String
    
    var messages: Any
  }
  object IntlState {
    
    inline def apply(locale: String, messages: Any): IntlState = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntlState]
    }
    
    extension [Self <: IntlState](x: Self) {
      
      inline def setFormats(value: Any): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setMessages(value: Any): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    }
  }
}
