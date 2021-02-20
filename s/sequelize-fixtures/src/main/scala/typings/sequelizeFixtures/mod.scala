package typings.sequelizeFixtures

import org.scalablytyped.runtime.Shortcut
import typings.sequelize.mod.Transaction
import typings.sequelizeFixtures.mod.SequelizeFixtures.SequelizeFixturesStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("sequelize-fixtures", JSImport.Namespace)
  @js.native
  val ^ : SequelizeFixturesStatic = js.native
  
  object SequelizeFixtures {
    
    @js.native
    trait Options extends StObject {
      
      var encoding: js.UndefOr[String] = js.native
      
      var log: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
      
      var modifyFixtureDataFn: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
      
      var transaction: js.UndefOr[Transaction] = js.native
      
      var transformFixtureDataFn: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
        
        @scala.inline
        def setLog(value: /* message */ String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
        
        @scala.inline
        def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
        
        @scala.inline
        def setModifyFixtureDataFn(value: /* data */ js.Any => _): Self = StObject.set(x, "modifyFixtureDataFn", js.Any.fromFunction1(value))
        
        @scala.inline
        def setModifyFixtureDataFnUndefined: Self = StObject.set(x, "modifyFixtureDataFn", js.undefined)
        
        @scala.inline
        def setTransaction(value: Transaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
        
        @scala.inline
        def setTransformFixtureDataFn(value: /* data */ js.Any => _): Self = StObject.set(x, "transformFixtureDataFn", js.Any.fromFunction1(value))
        
        @scala.inline
        def setTransformFixtureDataFnUndefined: Self = StObject.set(x, "transformFixtureDataFn", js.undefined)
      }
    }
    
    @js.native
    trait SequelizeFixturesStatic extends StObject {
      
      def loadFile(file: String, models: js.Any): js.Promise[_] = js.native
      def loadFile(file: String, models: js.Any, options: Options): js.Promise[_] = js.native
      
      def loadFiles(files: js.Array[String], models: js.Any): js.Promise[_] = js.native
      def loadFiles(files: js.Array[String], models: js.Any, options: Options): js.Promise[_] = js.native
      
      def loadFixture(fixture: js.Any, models: js.Any): js.Promise[_] = js.native
      def loadFixture(fixture: js.Any, models: js.Any, options: Options): js.Promise[_] = js.native
      
      def loadFixtures(fixtures: js.Array[_], models: js.Any): js.Promise[_] = js.native
      def loadFixtures(fixtures: js.Array[_], models: js.Any, options: Options): js.Promise[_] = js.native
    }
  }
  
  type _To = SequelizeFixturesStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: SequelizeFixturesStatic = ^
}
