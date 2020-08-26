package typings.reactNativeSqliteStorage

import typings.reactNativeSqliteStorage.mod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactNativeSqliteStorageStrings {
  @js.native
  sealed trait Documents extends Location
  
  @js.native
  sealed trait Library extends Location
  
  @js.native
  sealed trait Shared extends Location
  
  @js.native
  sealed trait default extends Location
  
  @scala.inline
  def Documents: Documents = "Documents".asInstanceOf[Documents]
  @scala.inline
  def Library: Library = "Library".asInstanceOf[Library]
  @scala.inline
  def Shared: Shared = "Shared".asInstanceOf[Shared]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
}

