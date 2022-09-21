package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.stencilCoreStrings.dist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputTargetDist
  extends StObject
     with OutputTargetBase
     with OutputTarget {
  
  var buildDir: js.UndefOr[String] = js.undefined
  
  var collectionDir: js.UndefOr[String | Null] = js.undefined
  
  var copy: js.UndefOr[js.Array[CopyTask]] = js.undefined
  
  var dir: js.UndefOr[String] = js.undefined
  
  var empty: js.UndefOr[Boolean] = js.undefined
  
  var esmLoaderPath: js.UndefOr[String] = js.undefined
  
  var polyfills: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `true` this flag will transform aliased import paths defined in
    * a project's `tsconfig.json` to relative import paths in the compiled output's
    * `dist-collection` bundle if it is generated (i.e. `collectionDir` is set).
    *
    * Paths will be left in aliased format if `false` or `undefined`.
    *
    * @example
    * // tsconfig.json
    * {
    *   paths: {
    *     "@utils/ *": ['/src/utils/ *']
    *   }
    * }
    *
    * // Source file
    * import * as dateUtils from '@utils/date-utils';
    * // Output file
    * import * as dateUtils from '../utils/date-utils';
    */
  var transformAliasedImportPathsInCollection: js.UndefOr[Boolean | Null] = js.undefined
  
  @JSName("type")
  var type_OutputTargetDist: dist
  
  var typesDir: js.UndefOr[String] = js.undefined
}
object OutputTargetDist {
  
  inline def apply(): OutputTargetDist = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("dist")
    __obj.asInstanceOf[OutputTargetDist]
  }
  
  extension [Self <: OutputTargetDist](x: Self) {
    
    inline def setBuildDir(value: String): Self = StObject.set(x, "buildDir", value.asInstanceOf[js.Any])
    
    inline def setBuildDirUndefined: Self = StObject.set(x, "buildDir", js.undefined)
    
    inline def setCollectionDir(value: String): Self = StObject.set(x, "collectionDir", value.asInstanceOf[js.Any])
    
    inline def setCollectionDirNull: Self = StObject.set(x, "collectionDir", null)
    
    inline def setCollectionDirUndefined: Self = StObject.set(x, "collectionDir", js.undefined)
    
    inline def setCopy(value: js.Array[CopyTask]): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
    
    inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    inline def setCopyVarargs(value: CopyTask*): Self = StObject.set(x, "copy", js.Array(value*))
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    
    inline def setEsmLoaderPath(value: String): Self = StObject.set(x, "esmLoaderPath", value.asInstanceOf[js.Any])
    
    inline def setEsmLoaderPathUndefined: Self = StObject.set(x, "esmLoaderPath", js.undefined)
    
    inline def setPolyfills(value: Boolean): Self = StObject.set(x, "polyfills", value.asInstanceOf[js.Any])
    
    inline def setPolyfillsUndefined: Self = StObject.set(x, "polyfills", js.undefined)
    
    inline def setTransformAliasedImportPathsInCollection(value: Boolean): Self = StObject.set(x, "transformAliasedImportPathsInCollection", value.asInstanceOf[js.Any])
    
    inline def setTransformAliasedImportPathsInCollectionNull: Self = StObject.set(x, "transformAliasedImportPathsInCollection", null)
    
    inline def setTransformAliasedImportPathsInCollectionUndefined: Self = StObject.set(x, "transformAliasedImportPathsInCollection", js.undefined)
    
    inline def setType(value: dist): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypesDir(value: String): Self = StObject.set(x, "typesDir", value.asInstanceOf[js.Any])
    
    inline def setTypesDirUndefined: Self = StObject.set(x, "typesDir", js.undefined)
  }
}
