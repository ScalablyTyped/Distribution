package typings.snyk

import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFindFilesMod {
  
  @JSImport("snyk/dist/lib/find-files", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def find(path: String): js.Promise[FindFilesRes] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FindFilesRes]]
  inline def find(path: String, ignore: js.Array[String]): js.Promise[FindFilesRes] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(path.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FindFilesRes]]
  inline def find(path: String, ignore: js.Array[String], filter: js.Array[String]): js.Promise[FindFilesRes] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(path.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FindFilesRes]]
  inline def find(path: String, ignore: js.Array[String], filter: js.Array[String], levelsDeep: Double): js.Promise[FindFilesRes] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(path.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], levelsDeep.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FindFilesRes]]
  inline def find(path: String, ignore: js.Array[String], filter: Unit, levelsDeep: Double): js.Promise[FindFilesRes] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(path.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], levelsDeep.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FindFilesRes]]
  inline def find(path: String, ignore: Unit, filter: js.Array[String]): js.Promise[FindFilesRes] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(path.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FindFilesRes]]
  inline def find(path: String, ignore: Unit, filter: js.Array[String], levelsDeep: Double): js.Promise[FindFilesRes] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(path.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], levelsDeep.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FindFilesRes]]
  inline def find(path: String, ignore: Unit, filter: Unit, levelsDeep: Double): js.Promise[FindFilesRes] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(path.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], levelsDeep.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FindFilesRes]]
  
  inline def getStats(path: String): js.Promise[Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStats")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stats]]
  
  inline def readDirectory(path: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readDirectory")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  
  trait FindFilesRes extends StObject {
    
    var allFilesFound: js.Array[String]
    
    var files: js.Array[String]
  }
  object FindFilesRes {
    
    inline def apply(allFilesFound: js.Array[String], files: js.Array[String]): FindFilesRes = {
      val __obj = js.Dynamic.literal(allFilesFound = allFilesFound.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindFilesRes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FindFilesRes] (val x: Self) extends AnyVal {
      
      inline def setAllFilesFound(value: js.Array[String]): Self = StObject.set(x, "allFilesFound", value.asInstanceOf[js.Any])
      
      inline def setAllFilesFoundVarargs(value: String*): Self = StObject.set(x, "allFilesFound", js.Array(value*))
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
    }
  }
}
