package typings.setValue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(`object`: js.Object, path: InputType, value: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(`object`: js.Object, path: InputType, value: Any, options: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  // Technically, everything will fall to the last overload,
  // but the first one can be useful for signature help.
  /**
    * @param object The object to set `value` on
    * @param path The of the property to set.
    * @param value The value to set on `object[prop]`
    * @param [options]
    */
  inline def apply[T /* <: js.Object */, K /* <: /* keyof T */ String */](
    `object`: T,
    path: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply[T /* <: js.Object */, K /* <: /* keyof T */ String */](
    `object`: T,
    path: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("set-value", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type InputType = String | js.Symbol | (js.Array[String | js.Symbol])
  
  type MergeFunc = js.Function2[/* object */ Any, /* source */ Any, Any]
  
  trait Options extends StObject {
    
    /**
      * Allows you to update plain object values, instead of overwriting them.
      * @default  `undefined`
      */
    var merge: js.UndefOr[Boolean | MergeFunc] = js.undefined
    
    /**
      * Do not split properties that include a `/`.
      * By default, set-value assumes that properties with a `/` are not intended to be split.
      * This option allows you to disable default behavior.
      * Note that this option cannot be used if `options.separator` is set to `/`.
      * @default true
      */
    var preservePaths: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom separator to use for splitting object paths.
      * @default `.`
      */
    var separator: js.UndefOr[String] = js.undefined
    
    /**
      * Custom `.split()` function to use.
      */
    var split: js.UndefOr[SplitFunc] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setMerge(value: Boolean | MergeFunc): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
      
      inline def setMergeFunction2(value: (/* object */ Any, /* source */ Any) => Any): Self = StObject.set(x, "merge", js.Any.fromFunction2(value))
      
      inline def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
      
      inline def setPreservePaths(value: Boolean): Self = StObject.set(x, "preservePaths", value.asInstanceOf[js.Any])
      
      inline def setPreservePathsUndefined: Self = StObject.set(x, "preservePaths", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setSplit(value: (/* input */ String, /* options */ js.UndefOr[Options]) => String): Self = StObject.set(x, "split", js.Any.fromFunction2(value))
      
      inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
    }
  }
  
  type SplitFunc = js.Function2[/* input */ String, /* options */ js.UndefOr[Options], String]
}
