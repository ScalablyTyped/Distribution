package typings.sequelizeFixtures.mod.SequelizeFixtures

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SequelizeFixturesStatic extends js.Object {
  
  def loadFile(file: String, models: js.Any): js.Promise[_] = js.native
  def loadFile(file: String, models: js.Any, options: Options): js.Promise[_] = js.native
  
  def loadFiles(files: js.Array[String], models: js.Any): js.Promise[_] = js.native
  def loadFiles(files: js.Array[String], models: js.Any, options: Options): js.Promise[_] = js.native
  
  def loadFixture(fixture: js.Any, models: js.Any): js.Promise[_] = js.native
  def loadFixture(fixture: js.Any, models: js.Any, options: Options): js.Promise[_] = js.native
  
  def loadFixtures(fixtures: js.Array[_], models: js.Any): js.Promise[_] = js.native
  def loadFixtures(fixtures: js.Array[_], models: js.Any, options: Options): js.Promise[_] = js.native
}
