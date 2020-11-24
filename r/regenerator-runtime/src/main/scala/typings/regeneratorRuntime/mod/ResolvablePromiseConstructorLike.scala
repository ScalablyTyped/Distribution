package typings.regeneratorRuntime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new <T>(executor : (resolve : (value : T | std.PromiseLike<T>): void, reject : (reason : any | undefined): void): void): std.PromiseLike<T> */ @js.native
trait ResolvablePromiseConstructorLike extends js.Object {
  
  def resolve[T](): js.Thenable[T] = js.native
  def resolve[T](value: T): js.Thenable[T] = js.native
}
