package typings.schwifty.schwiftyMod

import org.scalablytyped.runtime.StringDictionary
import typings.knex.knexMod.Knex
import typings.schwifty.Anon_Knex
import typings.schwifty.TypeofClassModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("hapi", JSImport.Namespace)
@js.native
object hapiMod extends js.Object {
  @js.native
  trait Request extends js.Object {
    def knex(): Knex[_, js.Array[_]] = js.native
    def models(): StringDictionary[TypeofClassModel] = js.native
    def models(all: Boolean): StringDictionary[TypeofClassModel] = js.native
  }
  
  @js.native
  trait ResponseToolkit extends js.Object {
    def knex(): Knex[_, js.Array[_]] = js.native
    def models(): StringDictionary[TypeofClassModel] = js.native
    def models(all: Boolean): StringDictionary[TypeofClassModel] = js.native
  }
  
  @js.native
  trait Server extends js.Object {
    def knex(): Knex[_, js.Array[_]] = js.native
    def models(): StringDictionary[TypeofClassModel] = js.native
    def models(all: Boolean): StringDictionary[TypeofClassModel] = js.native
    def schwifty(config: js.Array[ModelClass]): Unit = js.native
    def schwifty(config: Anon_Knex): Unit = js.native
    def schwifty(config: ModelClass): Unit = js.native
  }
  
}

