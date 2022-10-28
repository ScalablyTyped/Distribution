package typings.sentryBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.sentryBrowser.anon.Email
import typings.sentryBrowser.anon.Mechanism
import typings.sentryTypes.typesDsnMod.DsnLike
import typings.sentryTypes.typesWrappedfunctionMod.WrappedFunction
import typings.sentryUtils.typesWorldwideMod.InternalGlobal
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHelpersMod {
  
  @JSImport("@sentry/browser/types/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/browser/types/helpers", "WINDOW")
  @js.native
  val WINDOW: InternalGlobal & Window = js.native
  
  inline def ignoreNextOnError(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ignoreNextOnError")().asInstanceOf[Unit]
  
  inline def shouldIgnoreOnError(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldIgnoreOnError")().asInstanceOf[Boolean]
  
  inline def wrap(fn: WrappedFunction): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def wrap(fn: WrappedFunction, options: Unit, before: WrappedFunction): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any], before.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def wrap(fn: WrappedFunction, options: Mechanism): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def wrap(fn: WrappedFunction, options: Mechanism, before: WrappedFunction): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any], before.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait ReportDialogOptions
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var dsn: js.UndefOr[DsnLike] = js.undefined
    
    var errorFormEntry: js.UndefOr[String] = js.undefined
    
    var errorGeneric: js.UndefOr[String] = js.undefined
    
    var eventId: js.UndefOr[String] = js.undefined
    
    var labelClose: js.UndefOr[String] = js.undefined
    
    var labelComments: js.UndefOr[String] = js.undefined
    
    var labelEmail: js.UndefOr[String] = js.undefined
    
    var labelName: js.UndefOr[String] = js.undefined
    
    var labelSubmit: js.UndefOr[String] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    /** Callback after reportDialog showed up */
    var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var subtitle: js.UndefOr[String] = js.undefined
    
    var subtitle2: js.UndefOr[String] = js.undefined
    
    var successMessage: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var user: js.UndefOr[Email] = js.undefined
  }
  object ReportDialogOptions {
    
    inline def apply(): ReportDialogOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReportDialogOptions]
    }
    
    extension [Self <: ReportDialogOptions](x: Self) {
      
      inline def setDsn(value: DsnLike): Self = StObject.set(x, "dsn", value.asInstanceOf[js.Any])
      
      inline def setDsnUndefined: Self = StObject.set(x, "dsn", js.undefined)
      
      inline def setErrorFormEntry(value: String): Self = StObject.set(x, "errorFormEntry", value.asInstanceOf[js.Any])
      
      inline def setErrorFormEntryUndefined: Self = StObject.set(x, "errorFormEntry", js.undefined)
      
      inline def setErrorGeneric(value: String): Self = StObject.set(x, "errorGeneric", value.asInstanceOf[js.Any])
      
      inline def setErrorGenericUndefined: Self = StObject.set(x, "errorGeneric", js.undefined)
      
      inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
      
      inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
      
      inline def setLabelClose(value: String): Self = StObject.set(x, "labelClose", value.asInstanceOf[js.Any])
      
      inline def setLabelCloseUndefined: Self = StObject.set(x, "labelClose", js.undefined)
      
      inline def setLabelComments(value: String): Self = StObject.set(x, "labelComments", value.asInstanceOf[js.Any])
      
      inline def setLabelCommentsUndefined: Self = StObject.set(x, "labelComments", js.undefined)
      
      inline def setLabelEmail(value: String): Self = StObject.set(x, "labelEmail", value.asInstanceOf[js.Any])
      
      inline def setLabelEmailUndefined: Self = StObject.set(x, "labelEmail", js.undefined)
      
      inline def setLabelName(value: String): Self = StObject.set(x, "labelName", value.asInstanceOf[js.Any])
      
      inline def setLabelNameUndefined: Self = StObject.set(x, "labelName", js.undefined)
      
      inline def setLabelSubmit(value: String): Self = StObject.set(x, "labelSubmit", value.asInstanceOf[js.Any])
      
      inline def setLabelSubmitUndefined: Self = StObject.set(x, "labelSubmit", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitle2(value: String): Self = StObject.set(x, "subtitle2", value.asInstanceOf[js.Any])
      
      inline def setSubtitle2Undefined: Self = StObject.set(x, "subtitle2", js.undefined)
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setSuccessMessage(value: String): Self = StObject.set(x, "successMessage", value.asInstanceOf[js.Any])
      
      inline def setSuccessMessageUndefined: Self = StObject.set(x, "successMessage", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUser(value: Email): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
}
