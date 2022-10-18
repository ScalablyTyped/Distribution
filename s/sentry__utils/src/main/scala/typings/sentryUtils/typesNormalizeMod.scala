package typings.sentryUtils

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.typesMiscMod.Primitive
import typings.sentryUtils.typesMemoMod.MemoFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNormalizeMod {
  
  @JSImport("@sentry/utils/types/normalize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalize(input: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(input.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def normalize(input: Any, depth: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(input.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def normalize(input: Any, depth: Double, maxProperties: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(input.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], maxProperties.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def normalize(input: Any, depth: Unit, maxProperties: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(input.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], maxProperties.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def normalizeToSize[T](`object`: StringDictionary[Any]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeToSize")(`object`.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def normalizeToSize[T](`object`: StringDictionary[Any], depth: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeToSize")(`object`.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def normalizeToSize[T](`object`: StringDictionary[Any], depth: Double, maxSize: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeToSize")(`object`.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def normalizeToSize[T](`object`: StringDictionary[Any], depth: Unit, maxSize: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeToSize")(`object`.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Visits a node to perform normalization on it
    *
    * @param key The key corresponding to the given node
    * @param value The node to be visited
    * @param depth Optional number indicating the maximum recursion depth
    * @param maxProperties Optional maximum number of properties/elements included in any single object/array
    * @param memo Optional Memo class handling decycling
    */
  inline def walk(key: String, value: Any): Primitive | ObjOrArray[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Primitive | ObjOrArray[Any]]
  inline def walk(key: String, value: Any, depth: Double): Primitive | ObjOrArray[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Primitive | ObjOrArray[Any]]
  inline def walk(key: String, value: Any, depth: Double, maxProperties: Double): Primitive | ObjOrArray[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], maxProperties.asInstanceOf[js.Any])).asInstanceOf[Primitive | ObjOrArray[Any]]
  inline def walk(key: String, value: Any, depth: Double, maxProperties: Double, memo: MemoFunc): Primitive | ObjOrArray[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], maxProperties.asInstanceOf[js.Any], memo.asInstanceOf[js.Any])).asInstanceOf[Primitive | ObjOrArray[Any]]
  inline def walk(key: String, value: Any, depth: Double, maxProperties: Unit, memo: MemoFunc): Primitive | ObjOrArray[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], maxProperties.asInstanceOf[js.Any], memo.asInstanceOf[js.Any])).asInstanceOf[Primitive | ObjOrArray[Any]]
  inline def walk(key: String, value: Any, depth: Unit, maxProperties: Double): Primitive | ObjOrArray[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], maxProperties.asInstanceOf[js.Any])).asInstanceOf[Primitive | ObjOrArray[Any]]
  inline def walk(key: String, value: Any, depth: Unit, maxProperties: Double, memo: MemoFunc): Primitive | ObjOrArray[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], maxProperties.asInstanceOf[js.Any], memo.asInstanceOf[js.Any])).asInstanceOf[Primitive | ObjOrArray[Any]]
  inline def walk(key: String, value: Any, depth: Unit, maxProperties: Unit, memo: MemoFunc): Primitive | ObjOrArray[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], maxProperties.asInstanceOf[js.Any], memo.asInstanceOf[js.Any])).asInstanceOf[Primitive | ObjOrArray[Any]]
  
  type ObjOrArray[T] = StringDictionary[T]
}
