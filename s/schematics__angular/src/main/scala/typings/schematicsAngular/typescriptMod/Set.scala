package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ES6 Set interface. */
trait Set[T]
  extends StObject
     with ReadonlySet[T]
     with Collection[T] {
  
  def add(value: T): this.type
}
object Set {
  
  inline def apply[T](
    add: T => Set[T],
    clear: () => Unit,
    delete: T => Boolean,
    entries: () => Iterator[js.Tuple2[T, T]],
    forEach: js.Function2[T, T, Unit] => Unit,
    has: T => Boolean,
    keys: () => Iterator[T],
    size: Double,
    values: () => Iterator[T]
  ): Set[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), entries = js.Any.fromFunction0(entries), forEach = js.Any.fromFunction1(forEach), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), size = size.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[Set[T]]
  }
  
  extension [Self <: Set[?], T](x: Self & Set[T]) {
    
    inline def setAdd(value: T => Set[T]): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
  }
}
