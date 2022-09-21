package typings.sequelizeFixtures

import org.scalablytyped.runtime.Shortcut
import typings.sequelize.mod.Transaction
import typings.sequelizeFixtures.mod.SequelizeFixtures.SequelizeFixturesStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("sequelize-fixtures", JSImport.Namespace)
  @js.native
  val ^ : SequelizeFixturesStatic = js.native
  
  object SequelizeFixtures {
    
    trait Options extends StObject {
      
      var encoding: js.UndefOr[String] = js.undefined
      
      var log: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
      
      var modifyFixtureDataFn: js.UndefOr[js.Function1[/* data */ Any, Any]] = js.undefined
      
      var transaction: js.UndefOr[Transaction] = js.undefined
      
      var transformFixtureDataFn: js.UndefOr[js.Function1[/* data */ Any, Any]] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
        
        inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
        
        inline def setLog(value: /* message */ String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
        
        inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
        
        inline def setModifyFixtureDataFn(value: /* data */ Any => Any): Self = StObject.set(x, "modifyFixtureDataFn", js.Any.fromFunction1(value))
        
        inline def setModifyFixtureDataFnUndefined: Self = StObject.set(x, "modifyFixtureDataFn", js.undefined)
        
        inline def setTransaction(value: Transaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
        
        inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
        
        inline def setTransformFixtureDataFn(value: /* data */ Any => Any): Self = StObject.set(x, "transformFixtureDataFn", js.Any.fromFunction1(value))
        
        inline def setTransformFixtureDataFnUndefined: Self = StObject.set(x, "transformFixtureDataFn", js.undefined)
      }
    }
    
    @js.native
    trait SequelizeFixturesStatic extends StObject {
      
      def loadFile(file: String, models: Any): js.Promise[Any] = js.native
      def loadFile(file: String, models: Any, options: Options): js.Promise[Any] = js.native
      
      def loadFiles(files: js.Array[String], models: Any): js.Promise[Any] = js.native
      def loadFiles(files: js.Array[String], models: Any, options: Options): js.Promise[Any] = js.native
      
      def loadFixture(fixture: Any, models: Any): js.Promise[Any] = js.native
      def loadFixture(fixture: Any, models: Any, options: Options): js.Promise[Any] = js.native
      
      def loadFixtures(fixtures: js.Array[Any], models: Any): js.Promise[Any] = js.native
      def loadFixtures(fixtures: js.Array[Any], models: Any, options: Options): js.Promise[Any] = js.native
    }
  }
  
  type _To = SequelizeFixturesStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: SequelizeFixturesStatic = ^
}
