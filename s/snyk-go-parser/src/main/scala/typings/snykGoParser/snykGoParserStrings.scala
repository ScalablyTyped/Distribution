package typings.snykGoParser

import typings.snykGoParser.typesMod.GoPackageManagerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object snykGoParserStrings {
  @js.native
  sealed trait golangdep extends GoPackageManagerType
  
  @js.native
  sealed trait gomodules extends GoPackageManagerType
  
  @js.native
  sealed trait govendor extends GoPackageManagerType
  
  @scala.inline
  def golangdep: golangdep = "golangdep".asInstanceOf[golangdep]
  @scala.inline
  def gomodules: gomodules = "gomodules".asInstanceOf[gomodules]
  @scala.inline
  def govendor: govendor = "govendor".asInstanceOf[govendor]
}

