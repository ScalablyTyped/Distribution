package typings.raml1Parser

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("raml-1-parser/dist/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-1-parser/dist/util", "asArray")
  @js.native
  def asArray: js.Function1[/* v */ js.UndefOr[Any | js.Array[Any]], js.Array[Any]] = js.native
  inline def asArray_=(x: js.Function1[/* v */ js.UndefOr[Any | js.Array[Any]], js.Array[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("asArray")(x.asInstanceOf[js.Any])
  
  @JSImport("raml-1-parser/dist/util", "collectInstancesOf")
  @js.native
  def collectInstancesOf: js.Function2[/* xs */ js.Array[Any], /* C */ Constructor[Any], js.Array[Any]] = js.native
  
  @JSImport("raml-1-parser/dist/util", "collectInstancesOfInMap")
  @js.native
  def collectInstancesOfInMap: js.Function2[/* map */ Any, /* C */ Constructor[Any], js.Array[js.Tuple2[String, Any]]] = js.native
  inline def collectInstancesOfInMap_=(x: js.Function2[/* map */ Any, /* C */ Constructor[Any], js.Array[js.Tuple2[String, Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collectInstancesOfInMap")(x.asInstanceOf[js.Any])
  
  inline def collectInstancesOf_=(x: js.Function2[/* xs */ js.Array[Any], /* C */ Constructor[Any], js.Array[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collectInstancesOf")(x.asInstanceOf[js.Any])
  
  inline def deepCopy(`val`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deepCopy")(`val`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("raml-1-parser/dist/util", "defined")
  @js.native
  def defined: js.Function1[/* x */ Any, Boolean] = js.native
  inline def defined_=(x: js.Function1[/* x */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defined")(x.asInstanceOf[js.Any])
  
  inline def find[T](xs: js.Array[T], f: js.Function1[/* T */ Any, Boolean]): typings.raml1Parser.optMod.^[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(xs.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.optMod.^[T]]
  
  inline def firstToUpper(q: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("firstToUpper")(q.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("raml-1-parser/dist/util", "flatMap")
  @js.native
  def flatMap: js.Function2[
    /* xs */ js.Array[Any], 
    /* f */ js.Function1[/* T */ Any, js.Array[Any]], 
    js.Array[Any]
  ] = js.native
  inline def flatMap_=(
    x: js.Function2[
      /* xs */ js.Array[Any], 
      /* f */ js.Function1[/* T */ Any, js.Array[Any]], 
      js.Array[Any]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flatMap")(x.asInstanceOf[js.Any])
  
  @JSImport("raml-1-parser/dist/util", "flatten")
  @js.native
  def flatten: js.Function1[/* xss */ js.Array[js.Array[Any]], js.Array[Any]] = js.native
  
  inline def flattenArrayOfObjects[T](x: js.Array[StringDictionary[T]]): StringDictionary[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenArrayOfObjects")(x.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[T]]
  
  inline def flatten_=(x: js.Function1[/* xss */ js.Array[js.Array[Any]], js.Array[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flatten")(x.asInstanceOf[js.Any])
  
  inline def fromTuples[U](tuples: js.Array[js.Tuple2[String, U]]): StringDictionary[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTuples")(tuples.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[U]]
  
  inline def getAllRequiredExternalModulesFromCode(code: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllRequiredExternalModulesFromCode")(code.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @JSImport("raml-1-parser/dist/util", "ifInstanceOf")
  @js.native
  def ifInstanceOf: js.Function3[/* v */ Any, /* C */ Constructor[Any], /* f */ js.Function1[/* T */ Any, Unit], Unit] = js.native
  inline def ifInstanceOf_=(
    x: js.Function3[/* v */ Any, /* C */ Constructor[Any], /* f */ js.Function1[/* T */ Any, Unit], Unit]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ifInstanceOf")(x.asInstanceOf[js.Any])
  
  inline def iff[T](v: T, f: js.Function1[/* T */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("iff")(v.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def indexed(objects: js.Array[Dict[Any]], key: String): Dict[Dict[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("indexed")(objects.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Dict[Dict[Any]]]
  inline def indexed(objects: js.Array[Dict[Any]], key: String, delKey: Boolean): Dict[Dict[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("indexed")(objects.asInstanceOf[js.Any], key.asInstanceOf[js.Any], delKey.asInstanceOf[js.Any])).asInstanceOf[Dict[Dict[Any]]]
  
  inline def isEssential(arg: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEssential")(arg.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("raml-1-parser/dist/util", "isInstance")
  @js.native
  def isInstance: js.Function2[/* v */ Any, /* C */ Constructor[Any], js.Array[Any]] = js.native
  inline def isInstance_=(x: js.Function2[/* v */ Any, /* C */ Constructor[Any], js.Array[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInstance")(x.asInstanceOf[js.Any])
  
  inline def isRAMLUrl(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRAMLUrl")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def kv[T](obj: Dict[T], iter: js.Function2[/* string */ Any, /* T */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("kv")(obj.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def lazypropkeyfilter(k: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("lazypropkeyfilter")(k.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def lazyprops(obj: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("lazyprops")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def lazyprops(obj: js.Object, keyfilter: js.Function1[/* k */ String, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lazyprops")(obj.asInstanceOf[js.Any], keyfilter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def replace(str: String, x: String, r: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(str.asInstanceOf[js.Any], x.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def replaceMap(str: String, map: StringDictionary[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceMap")(str.asInstanceOf[js.Any], map.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("raml-1-parser/dist/util", "serial")
  @js.native
  def serial: js.Function0[Double] = js.native
  inline def serial_=(x: js.Function0[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serial")(x.asInstanceOf[js.Any])
  
  @JSImport("raml-1-parser/dist/util", "shallowCopy")
  @js.native
  def shallowCopy: js.Function1[/* obj */ Dict[Any], Dict[Any]] = js.native
  inline def shallowCopy_=(x: js.Function1[/* obj */ Dict[Any], Dict[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shallowCopy")(x.asInstanceOf[js.Any])
  
  inline def stringEndsWith(str: String, search: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("stringEndsWith")(str.asInstanceOf[js.Any], search.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def stringStartsWith(str: String, search: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("stringStartsWith")(str.asInstanceOf[js.Any], search.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def stringStartsWith(str: String, search: String, ind: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("stringStartsWith")(str.asInstanceOf[js.Any], search.asInstanceOf[js.Any], ind.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("raml-1-parser/dist/util", "takeWhile")
  @js.native
  def takeWhile: js.Function2[/* xs */ js.Array[Any], /* f */ js.Function1[/* T */ Any, Boolean], js.Array[Any]] = js.native
  inline def takeWhile_=(x: js.Function2[/* xs */ js.Array[Any], /* f */ js.Function1[/* T */ Any, Boolean], js.Array[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("takeWhile")(x.asInstanceOf[js.Any])
  
  inline def tap[T](v: T, f: js.Function1[/* T */ Any, Unit]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(v.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def toTuples[U](map: StringDictionary[U]): js.Array[js.Tuple2[String, U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toTuples")(map.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[String, U]]]
  
  inline def updateObject(source: Any, target: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateObject")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateObject(source: Any, target: Any, addNewFields: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateObject")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], addNewFields.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait Constructor[T]
    extends StObject
       with Instantiable1[/* args (repeated) */ Any, T]
  
  type Dict[T] = StringDictionary[T]
}
