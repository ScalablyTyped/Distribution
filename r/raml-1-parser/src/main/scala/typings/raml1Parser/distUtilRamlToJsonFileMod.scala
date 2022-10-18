package typings.raml1Parser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilRamlToJsonFileMod {
  
  @JSImport("raml-1-parser/dist/util/ramlToJsonFile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def saveToJson(apiPath: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("saveToJson")(apiPath.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def saveToJson(apiPath: String, arg1: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveToJson")(apiPath.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def saveToJson(apiPath: String, arg1: js.Array[String], arg2: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveToJson")(apiPath.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def saveToJson(apiPath: String, arg1: js.Array[String], arg2: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveToJson")(apiPath.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def saveToJson(apiPath: String, arg1: Unit, arg2: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveToJson")(apiPath.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def saveToJson(apiPath: String, arg1: Unit, arg2: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveToJson")(apiPath.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def saveToJson(apiPath: String, arg1: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveToJson")(apiPath.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def saveToJson(apiPath: String, arg1: Options, arg2: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveToJson")(apiPath.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def saveToJson(apiPath: String, arg1: Options, arg2: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveToJson")(apiPath.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Options
    extends StObject
       with typings.raml1Parser.distParserWrappedAstParserCoreApiMod.Options {
    
    var ignoreMeta: js.UndefOr[Boolean] = js.undefined
    
    var outputJsonFolder: js.UndefOr[String] = js.undefined
    
    var postfix: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setIgnoreMeta(value: Boolean): Self = StObject.set(x, "ignoreMeta", value.asInstanceOf[js.Any])
      
      inline def setIgnoreMetaUndefined: Self = StObject.set(x, "ignoreMeta", js.undefined)
      
      inline def setOutputJsonFolder(value: String): Self = StObject.set(x, "outputJsonFolder", value.asInstanceOf[js.Any])
      
      inline def setOutputJsonFolderUndefined: Self = StObject.set(x, "outputJsonFolder", js.undefined)
      
      inline def setPostfix(value: String): Self = StObject.set(x, "postfix", value.asInstanceOf[js.Any])
      
      inline def setPostfixUndefined: Self = StObject.set(x, "postfix", js.undefined)
    }
  }
}
