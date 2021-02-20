package typings.resourceLoader.resourceLoaderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @namespace middleware
  */
object middleware {
  
  /**
    * A simple in-memory cache for resource.
    *
    * @memberof middleware
    * @function caching
    * @example
    * import { Loader, middleware } from 'resource-loader';
    * const loader = new Loader();
    * loader.use(middleware.caching);
    * @param {Resource} resource - Current Resource
    * @param {function} next - Callback when complete
    */
  @JSImport("resource-loader", "middleware.caching")
  @js.native
  def caching(resource: Resource, next: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  /**
    * A middleware for transforming XHR loaded Blobs into more useful objects
    *
    * @memberof middleware
    * @function parsing
    * @example
    * import { Loader, middleware } from 'resource-loader';
    * const loader = new Loader();
    * loader.use(middleware.parsing);
    * @param {Resource} resource - Current Resource
    * @param {function} next - Callback when complete
    */
  @JSImport("resource-loader", "middleware.parsing")
  @js.native
  def parsing(resource: Resource, next: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
}
