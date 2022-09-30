package typings.reactQuery.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfiniteQueryObserverBaseResult[TData, TError]
  extends StObject
     with QueryObserverBaseResult[InfiniteData[TData], TError] {
  
  def fetchNextPage(): js.Promise[InfiniteQueryObserverResult[TData, TError]] = js.native
  def fetchNextPage(options: FetchNextPageOptions): js.Promise[InfiniteQueryObserverResult[TData, TError]] = js.native
  
  def fetchPreviousPage(): js.Promise[InfiniteQueryObserverResult[TData, TError]] = js.native
  def fetchPreviousPage(options: FetchPreviousPageOptions): js.Promise[InfiniteQueryObserverResult[TData, TError]] = js.native
  
  var hasNextPage: js.UndefOr[Boolean] = js.native
  
  var hasPreviousPage: js.UndefOr[Boolean] = js.native
  
  var isFetchingNextPage: Boolean = js.native
  
  var isFetchingPreviousPage: Boolean = js.native
}
