package typings.rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Set[T] extends StObject {
  
  def add(value: T): Set[T] = js.native
  
  def clear(): Unit = js.native
  
  def delete(value: T): Boolean = js.native
  
  def entries(): IterableIterator[js.Tuple2[T, T]] = js.native
  
  def forEach(callbackfn: js.Function3[/* value */ T, /* index */ T, /* set */ Set[T], Unit]): Unit = js.native
  def forEach(callbackfn: js.Function3[/* value */ T, /* index */ T, /* set */ Set[T], Unit], thisArg: js.Any): Unit = js.native
  
  def has(value: T): Boolean = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[T]] = js.native
  
  def keys(): IterableIterator[T] = js.native
  
  var size: Double = js.native
  
  @JSName(js.Symbol.toStringTag)
  var toStringTag: String = js.native
  
  def values(): IterableIterator[T] = js.native
}
