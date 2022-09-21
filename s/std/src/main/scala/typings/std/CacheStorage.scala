package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The storage for Cache objects.
  * Available only in secure contexts.
  */
@js.native
trait CacheStorage extends StObject {
  
  /* standard dom */
  def delete(cacheName: java.lang.String): js.Promise[scala.Boolean] = js.native
  
  /* standard dom */
  def has(cacheName: java.lang.String): js.Promise[scala.Boolean] = js.native
  
  /* standard dom */
  def keys(): js.Promise[js.Array[java.lang.String]] = js.native
  
  /* standard dom */
  def `match`(request: RequestInfo): js.Promise[js.UndefOr[Response]] = js.native
  def `match`(request: RequestInfo, options: MultiCacheQueryOptions): js.Promise[js.UndefOr[Response]] = js.native
  def `match`(request: URL): js.Promise[js.UndefOr[Response]] = js.native
  def `match`(request: URL, options: MultiCacheQueryOptions): js.Promise[js.UndefOr[Response]] = js.native
  
  /* standard dom */
  def open(cacheName: java.lang.String): js.Promise[Cache] = js.native
}
