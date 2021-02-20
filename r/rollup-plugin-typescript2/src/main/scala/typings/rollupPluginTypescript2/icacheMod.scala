package typings.rollupPluginTypescript2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object icacheMod {
  
  @js.native
  trait ICache[DataType] extends StObject {
    
    def exists(name: String): Boolean = js.native
    
    def `match`(names: js.Array[String]): Boolean = js.native
    
    def path(name: String): String = js.native
    
    def read(name: String): js.UndefOr[DataType | Null] = js.native
    
    def roll(): Unit = js.native
    
    def touch(name: String): Unit = js.native
    
    def write(name: String, data: DataType): Unit = js.native
  }
  object ICache {
    
    @scala.inline
    def apply[DataType](
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
    implicit class ICacheMutableBuilder[Self <: ICache[_], DataType] (val x: Self with ICache[DataType]) extends AnyVal {
      
      @scala.inline
      def setExists(value: String => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMatch(value: js.Array[String] => Boolean): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPath(value: String => String): Self = StObject.set(x, "path", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRead(value: String => js.UndefOr[DataType | Null]): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRoll(value: () => Unit): Self = StObject.set(x, "roll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTouch(value: String => Unit): Self = StObject.set(x, "touch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWrite(value: (String, DataType) => Unit): Self = StObject.set(x, "write", js.Any.fromFunction2(value))
    }
  }
}
