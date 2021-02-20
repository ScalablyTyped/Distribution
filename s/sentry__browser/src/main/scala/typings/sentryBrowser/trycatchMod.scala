package typings.sentryBrowser

import typings.sentryBrowser.anon.PartialTryCatchOptions
import typings.sentryTypes.integrationMod.Integration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trycatchMod {
  
  @JSImport("@sentry/browser/dist/integrations/trycatch", "TryCatch")
  @js.native
  /**
    * @inheritDoc
    */
  class TryCatch () extends Integration {
    def this(options: PartialTryCatchOptions) = this()
    
    /** JSDoc */
    val _options: js.Any = js.native
    
    /** JSDoc */
    var _wrapEventTarget: js.Any = js.native
    
    /** JSDoc */
    var _wrapRAF: js.Any = js.native
    
    /** JSDoc */
    var _wrapTimeFunction: js.Any = js.native
    
    /** JSDoc */
    var _wrapXHR: js.Any = js.native
    
    /**
      * Wrap timer functions and event targets to catch errors
      * and provide better metadata.
      */
    def setupOnce(): Unit = js.native
  }
  /* static members */
  object TryCatch {
    
    @JSImport("@sentry/browser/dist/integrations/trycatch", "TryCatch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser/dist/integrations/trycatch", "TryCatch.id")
    @js.native
    def id: String = js.native
    @scala.inline
    def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  /** JSDoc */
  @js.native
  trait TryCatchOptions extends StObject {
    
    var XMLHttpRequest: Boolean = js.native
    
    var eventTarget: Boolean | js.Array[String] = js.native
    
    var requestAnimationFrame: Boolean = js.native
    
    var setInterval: Boolean = js.native
    
    var setTimeout: Boolean = js.native
  }
  object TryCatchOptions {
    
    @scala.inline
    def apply(
      XMLHttpRequest: Boolean,
      eventTarget: Boolean | js.Array[String],
      requestAnimationFrame: Boolean,
      setInterval: Boolean,
      setTimeout: Boolean
    ): TryCatchOptions = {
      val __obj = js.Dynamic.literal(XMLHttpRequest = XMLHttpRequest.asInstanceOf[js.Any], eventTarget = eventTarget.asInstanceOf[js.Any], requestAnimationFrame = requestAnimationFrame.asInstanceOf[js.Any], setInterval = setInterval.asInstanceOf[js.Any], setTimeout = setTimeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[TryCatchOptions]
    }
    
    @scala.inline
    implicit class TryCatchOptionsMutableBuilder[Self <: TryCatchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventTarget(value: Boolean | js.Array[String]): Self = StObject.set(x, "eventTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventTargetVarargs(value: String*): Self = StObject.set(x, "eventTarget", js.Array(value :_*))
      
      @scala.inline
      def setRequestAnimationFrame(value: Boolean): Self = StObject.set(x, "requestAnimationFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetInterval(value: Boolean): Self = StObject.set(x, "setInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetTimeout(value: Boolean): Self = StObject.set(x, "setTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXMLHttpRequest(value: Boolean): Self = StObject.set(x, "XMLHttpRequest", value.asInstanceOf[js.Any])
    }
  }
}
