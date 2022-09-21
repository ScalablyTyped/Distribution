package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.stencilCoreStrings.`dist-collection`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputTargetDistCollection
  extends StObject
     with OutputTargetBase
     with OutputTarget
     with OutputTargetBuild {
  
  var collectionDir: String
  
  var dir: String
  
  var empty: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `true` this flag will transform aliased import paths defined in
    * a project's `tsconfig.json` to relative import paths in the compiled output.
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
  var transformAliasedImportPaths: js.UndefOr[Boolean | Null] = js.undefined
  
  @JSName("type")
  var type_OutputTargetDistCollection: `dist-collection`
}
object OutputTargetDistCollection {
  
  inline def apply(collectionDir: String, dir: String): OutputTargetDistCollection = {
    val __obj = js.Dynamic.literal(collectionDir = collectionDir.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dist-collection")
    __obj.asInstanceOf[OutputTargetDistCollection]
  }
  
  extension [Self <: OutputTargetDistCollection](x: Self) {
    
    inline def setCollectionDir(value: String): Self = StObject.set(x, "collectionDir", value.asInstanceOf[js.Any])
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    
    inline def setTransformAliasedImportPaths(value: Boolean): Self = StObject.set(x, "transformAliasedImportPaths", value.asInstanceOf[js.Any])
    
    inline def setTransformAliasedImportPathsNull: Self = StObject.set(x, "transformAliasedImportPaths", null)
    
    inline def setTransformAliasedImportPathsUndefined: Self = StObject.set(x, "transformAliasedImportPaths", js.undefined)
    
    inline def setType(value: `dist-collection`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
