package typings.readJsonSafe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("read-json-safe/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readJSON(path: String): js.Promise[
    js.UndefOr[
      String | Double | Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any) | Null
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    js.UndefOr[
      String | Double | Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any) | Null
    ]
  ]]
  
  inline def readJSONArray(path: String): js.Promise[
    js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONArray */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("readJSONArray")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONArray */ Any
    ]
  ]]
  
  inline def readJSONArraySync(path: String): js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONArray */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("readJSONArraySync")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONArray */ Any
  ]]
  
  inline def readJSONObject(path: String): js.Promise[
    js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("readJSONObject")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any
    ]
  ]]
  
  inline def readJSONObjectSync(path: String): js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("readJSONObjectSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any
  ]]
  
  inline def readJSONSync(path: String): js.UndefOr[
    String | Double | Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any) | Null
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("readJSONSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
    String | Double | Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any) | Null
  ]]
}
