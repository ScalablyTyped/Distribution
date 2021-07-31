package typings.puppeteerCore

import typings.puppeteerCore.productMod.Product
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object launcherMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/node/Launcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(projectRoot: String, preferredRevision: String, isPuppeteerCore: Boolean): ProductLauncher = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(projectRoot.asInstanceOf[js.Any], preferredRevision.asInstanceOf[js.Any], isPuppeteerCore.asInstanceOf[js.Any])).asInstanceOf[ProductLauncher]
  @scala.inline
  def default(projectRoot: String, preferredRevision: String, isPuppeteerCore: Boolean, product: String): ProductLauncher = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(projectRoot.asInstanceOf[js.Any], preferredRevision.asInstanceOf[js.Any], isPuppeteerCore.asInstanceOf[js.Any], product.asInstanceOf[js.Any])).asInstanceOf[ProductLauncher]
  
  trait ProductLauncher extends StObject {
    
    def defaultArgs(`object`: js.Any): js.Any
    
    def executablePath(): String
    
    def launch(`object`: js.Any): js.Any
    
    var product: Product
  }
  object ProductLauncher {
    
    @scala.inline
    def apply(
      defaultArgs: js.Any => js.Any,
      executablePath: () => String,
      launch: js.Any => js.Any,
      product: Product
    ): ProductLauncher = {
      val __obj = js.Dynamic.literal(defaultArgs = js.Any.fromFunction1(defaultArgs), executablePath = js.Any.fromFunction0(executablePath), launch = js.Any.fromFunction1(launch), product = product.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProductLauncher]
    }
    
    @scala.inline
    implicit class ProductLauncherMutableBuilder[Self <: ProductLauncher] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultArgs(value: js.Any => js.Any): Self = StObject.set(x, "defaultArgs", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExecutablePath(value: () => String): Self = StObject.set(x, "executablePath", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLaunch(value: js.Any => js.Any): Self = StObject.set(x, "launch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProduct(value: Product): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    }
  }
}
