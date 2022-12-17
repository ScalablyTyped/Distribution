package typings.puppeteer

import typings.puppeteerCore.mod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerTypesMod {
  
  @JSImport("puppeteer/lib/cjs/puppeteer/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(createBrowserFetcher, defaultArgs, executablePath, launch) */ inline def connect(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Puppeteer.ConnectOptions */ Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_types.Browser */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_types.Browser */ Any
  ]]
  
  inline def getConfiguration(): Configuration = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfiguration")().asInstanceOf[Configuration]
}
