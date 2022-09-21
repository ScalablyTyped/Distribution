package typings.puppeteer.mod

import typings.puppeteer.anon.Timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer", "BrowserContext")
@js.native
open class BrowserContext () extends EventEmitter {
  
  /**
    * The browser this browser context belongs to.
    */
  def browser(): Browser = js.native
  
  /**
    * Clears all permission overrides for the browser context.
    *
    * @example
    *
    * ```ts
    * const context = browser.defaultBrowserContext();
    * context.overridePermissions('https://example.com', ['clipboard-read']);
    * // do stuff ..
    * context.clearPermissionOverrides();
    * ```
    */
  def clearPermissionOverrides(): js.Promise[Unit] = js.native
  
  /**
    * Closes the browser context. All the targets that belong to the browser context
    * will be closed.
    *
    * @remarks
    * Only incognito browser contexts can be closed.
    */
  def close(): js.Promise[Unit] = js.native
  
  /**
    * Returns whether BrowserContext is incognito.
    * The default browser context is the only non-incognito browser context.
    *
    * @remarks
    * The default browser context cannot be closed.
    */
  def isIncognito(): Boolean = js.native
  
  /**
    * Creates a new page in the browser context.
    */
  def newPage(): js.Promise[Page] = js.native
  
  /**
    * @example
    *
    * ```ts
    * const context = browser.defaultBrowserContext();
    * await context.overridePermissions('https://html5demos.com', [
    *   'geolocation',
    * ]);
    * ```
    *
    * @param origin - The origin to grant permissions to, e.g. "https://example.com".
    * @param permissions - An array of permissions to grant.
    * All permissions that are not listed here will be automatically denied.
    */
  def overridePermissions(origin: String, permissions: js.Array[Permission]): js.Promise[Unit] = js.native
  
  /**
    * An array of all pages inside the browser context.
    *
    * @returns Promise which resolves to an array of all open pages.
    * Non visible pages, such as `"background_page"`, will not be listed here.
    * You can find them using {@link Target.page | the target page}.
    */
  def pages(): js.Promise[js.Array[Page]] = js.native
  
  /* Excluded from this release type: __constructor */
  /**
    * An array of all active targets inside the browser context.
    */
  def targets(): js.Array[Target] = js.native
  
  /**
    * This searches for a target in this specific browser context.
    *
    * @example
    * An example of finding a target for a page opened via `window.open`:
    *
    * ```ts
    * await page.evaluate(() => window.open('https://www.example.com/'));
    * const newWindowTarget = await browserContext.waitForTarget(
    *   target => target.url() === 'https://www.example.com/'
    * );
    * ```
    *
    * @param predicate - A function to be run for every target
    * @param options - An object of options. Accepts a timout,
    * which is the maximum wait time in milliseconds.
    * Pass `0` to disable the timeout. Defaults to 30 seconds.
    * @returns Promise which resolves to the first target found
    * that matches the `predicate` function.
    */
  def waitForTarget(predicate: js.Function1[/* x */ Target, Boolean | js.Promise[Boolean]]): js.Promise[Target] = js.native
  def waitForTarget(predicate: js.Function1[/* x */ Target, Boolean | js.Promise[Boolean]], options: Timeout): js.Promise[Target] = js.native
}
