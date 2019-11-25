package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDBEnvironment extends js.Object {
  val indexedDB: IDBFactory
}

object IDBEnvironment {
  @scala.inline
  def apply(indexedDB: IDBFactory): IDBEnvironment = {
    val __obj = js.Dynamic.literal(indexedDB = indexedDB.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDBEnvironment]
  }
}

