package typings.puppeteerCore.libCjsPuppeteerTypesMod

import typings.puppeteerCore.libCjsPuppeteerCommonPuppeteerMod.CommonPuppeteerSettings
import typings.puppeteerCore.libCjsPuppeteerCommonQueryHandlerMod.CustomQueryHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "Puppeteer")
@js.native
open class Puppeteer protected ()
  extends typings.puppeteerCore.libCjsPuppeteerPuppeteerCoreMod.Puppeteer {
  /**
    * @internal
    */
  def this(settings: CommonPuppeteerSettings) = this()
}
/* static members */
object Puppeteer {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/types", "Puppeteer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Unregisters all custom query handlers.
    */
  inline def clearCustomQueryHandlers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCustomQueryHandlers")().asInstanceOf[Unit]
  
  /**
    * Gets the names of all custom query handlers.
    */
  inline def customQueryHandlerNames(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("customQueryHandlerNames")().asInstanceOf[js.Array[String]]
  
  /**
    * Registers a {@link CustomQueryHandler | custom query handler}.
    *
    * @remarks
    * After registration, the handler can be used everywhere where a selector is
    * expected by prepending the selection string with `<name>/`. The name is only
    * allowed to consist of lower- and upper case latin letters.
    *
    * @example
    *
    * ```
    * puppeteer.registerCustomQueryHandler('text', { … });
    * const aHandle = await page.$('text/…');
    * ```
    *
    * @param name - The name that the custom query handler will be registered
    * under.
    * @param queryHandler - The {@link CustomQueryHandler | custom query handler}
    * to register.
    *
    * @public
    */
  inline def registerCustomQueryHandler(name: String, queryHandler: CustomQueryHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomQueryHandler")(name.asInstanceOf[js.Any], queryHandler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Unregisters a custom query handler for a given name.
    */
  inline def unregisterCustomQueryHandler(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterCustomQueryHandler")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
