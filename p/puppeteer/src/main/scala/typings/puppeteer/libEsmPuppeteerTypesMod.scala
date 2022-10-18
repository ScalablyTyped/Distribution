package typings.puppeteer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPuppeteerTypesMod {
  
  @JSImport("puppeteer/lib/esm/puppeteer/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @public
    */
  @JSImport("puppeteer/lib/esm/puppeteer/types", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PuppeteerNode */ Any = js.native
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(createBrowserFetcher, defaultArgs, executablePath, launch) */ inline def connect(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Puppeteer.ConnectOptions */ Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_types.Browser */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_types.Browser */ Any
  ]]
}
