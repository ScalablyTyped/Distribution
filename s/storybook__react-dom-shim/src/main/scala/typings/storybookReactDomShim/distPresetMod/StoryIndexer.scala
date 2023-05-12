package typings.storybookReactDomShim.distPresetMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoryIndexer extends StObject {
  
  def indexer(fileName: String, options: IndexerOptions): js.Promise[IndexedCSFFile]
  
  var test: js.RegExp
}
object StoryIndexer {
  
  inline def apply(indexer: (String, IndexerOptions) => js.Promise[IndexedCSFFile], test: js.RegExp): StoryIndexer = {
    val __obj = js.Dynamic.literal(indexer = js.Any.fromFunction2(indexer), test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryIndexer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StoryIndexer] (val x: Self) extends AnyVal {
    
    inline def setIndexer(value: (String, IndexerOptions) => js.Promise[IndexedCSFFile]): Self = StObject.set(x, "indexer", js.Any.fromFunction2(value))
    
    inline def setTest(value: js.RegExp): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
  }
}
