package typings.stormReactDiagrams

import typings.stormReactDiagrams.baseEntityMod.BaseEntityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stormReactDiagramsStrings {
  
  @scala.inline
  def link: link = "link".asInstanceOf[link]
  
  @scala.inline
  def node: node = "node".asInstanceOf[node]
  
  @scala.inline
  def point: point = "point".asInstanceOf[point]
  
  @scala.inline
  def port: port = "port".asInstanceOf[port]
  
  @js.native
  sealed trait link extends BaseEntityType
  
  @js.native
  sealed trait node extends BaseEntityType
  
  @js.native
  sealed trait point extends BaseEntityType
  
  @js.native
  sealed trait port extends BaseEntityType
}
