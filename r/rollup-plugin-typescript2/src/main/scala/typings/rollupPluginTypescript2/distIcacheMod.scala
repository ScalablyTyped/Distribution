package typings.rollupPluginTypescript2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIcacheMod {
  
  trait ICache[DataType] extends StObject {
    
    def exists(name: String): Boolean
    
    def `match`(names: js.Array[String]): Boolean
    
    def path(name: String): String
    
    def read(name: String): js.UndefOr[DataType | Null]
    
    def roll(): Unit
    
    def touch(name: String): Unit
    
    def write(name: String, data: DataType): Unit
  }
  object ICache {
    
    inline def apply[DataType](
      exists: String => Boolean,
      `match`: js.Array[String] => Boolean,
      path: String => String,
      read: String => js.UndefOr[DataType | Null],
      roll: () => Unit,
      touch: String => Unit,
      write: (String, DataType) => Unit
    ): ICache[DataType] = {
      val __obj = js.Dynamic.literal(exists = js.Any.fromFunction1(exists), path = js.Any.fromFunction1(path), read = js.Any.fromFunction1(read), roll = js.Any.fromFunction0(roll), touch = js.Any.fromFunction1(touch), write = js.Any.fromFunction2(write))
      __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
      __obj.asInstanceOf[ICache[DataType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICache[?], DataType] (val x: Self & ICache[DataType]) extends AnyVal {
      
      inline def setExists(value: String => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction1(value))
      
      inline def setMatch(value: js.Array[String] => Boolean): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
      
      inline def setPath(value: String => String): Self = StObject.set(x, "path", js.Any.fromFunction1(value))
      
      inline def setRead(value: String => js.UndefOr[DataType | Null]): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      inline def setRoll(value: () => Unit): Self = StObject.set(x, "roll", js.Any.fromFunction0(value))
      
      inline def setTouch(value: String => Unit): Self = StObject.set(x, "touch", js.Any.fromFunction1(value))
      
      inline def setWrite(value: (String, DataType) => Unit): Self = StObject.set(x, "write", js.Any.fromFunction2(value))
    }
  }
}
