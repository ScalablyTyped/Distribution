package typings.previewEmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Automatically opens your browser to preview Node.js email messages sent with Nodemailer. Made for Lad!
    *
    * The function `previewEmail` returns a `Promise` which resolves with a URL.
    * We automatically open the browser to this URL unless you specify options.open as false
    */
  inline def apply(message: typings.nodemailer.mailerMod.Options): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def apply(message: typings.nodemailer.mailerMod.Options, options: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @JSImport("preview-email", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait OpenOptions extends StObject {
    
    /** @default false */
    @JSName("wait")
    var wait_FOpenOptions: js.UndefOr[Boolean] = js.undefined
  }
  object OpenOptions {
    
    inline def apply(): OpenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenOptions]
    }
    
    extension [Self <: OpenOptions](x: Self) {
      
      inline def setWait_(value: Boolean): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      inline def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /**
      *  a path to a directory for saving the generated email previews (defaults to `os.tmpdir()`)
      */
    var dir: js.UndefOr[String] = js.undefined
    
    /**
      * a unique ID for the file name created for the preview in dir (defaults to `uuid.v4()` from `uuid`)
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * an options object that is passed to open (defaults to `{ wait: false }`).
      * If set to `false` then it will not open the email automatically in the browser using open,
      * and if set to true then it will default to `{ wait: false }`
      * @default { wait: false }
      */
    var open: js.UndefOr[OpenOptions | Boolean] = js.undefined
    
    /**
      *  file path to a pug template file (defaults to preview-email's `template.pug` by default)
      * - this is where you can pass a custom template for rendering email previews, e.g. your own stylesheet
      */
    var template: js.UndefOr[String] = js.undefined
    
    /**
      * a function to build preview url from file path
      * - this is where you can customize the opened path to handle WSL to Windows transformation or build a http url if dir is served.
      * @default (path) => 'file://[file path]'
      */
    var urlTransform: js.UndefOr[UrlTransform] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOpen(value: OpenOptions | Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setUrlTransform(value: /* path */ String => String): Self = StObject.set(x, "urlTransform", js.Any.fromFunction1(value))
      
      inline def setUrlTransformUndefined: Self = StObject.set(x, "urlTransform", js.undefined)
    }
  }
  
  /**
    * a function to build preview url from file path
    */
  type UrlTransform = js.Function1[/* path */ String, String]
}
