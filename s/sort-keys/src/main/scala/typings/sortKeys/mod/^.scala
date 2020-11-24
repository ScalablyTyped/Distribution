package typings.sortKeys.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sort-keys", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
  Sort the keys of an object.
  @returns A new object with sorted keys.
  @example
  ```
  import sortKeys = require('sort-keys');
  sortKeys({c: 0, a: 0, b: 0});
  //=> {a: 0, b: 0, c: 0}
  sortKeys({b: {b: 0, a: 0}, a: 0}, {deep: true});
  //=> {a: 0, b: {a: 0, b: 0}}
  sortKeys({b: [{b: 0, a: 0}], a: 0}, {deep: true});
  //=> {a: 0, b: [{a: 0, b: 0}]}
  sortKeys({c: 0, a: 0, b: 0}, {
  	compare: (a, b) => -a.localeCompare(b)
  });
  //=> {c: 0, b: 0, a: 0}
  sortKeys([{b: 0, a:2}], {deep: true});
  //=> [{a: 2, b: 0}]
  ```
  */
  def apply[T /* <: StringDictionary[js.Any] */](`object`: T): T = js.native
  def apply[T /* <: StringDictionary[js.Any] */](`object`: T, options: Options): T = js.native
  def apply[T](`object`: js.Array[T]): js.Array[T] = js.native
  def apply[T](`object`: js.Array[T], options: Options): js.Array[T] = js.native
}
