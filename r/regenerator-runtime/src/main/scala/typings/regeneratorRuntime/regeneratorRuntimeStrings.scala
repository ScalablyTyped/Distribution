package typings.regeneratorRuntime

import typings.regeneratorRuntime.mod.CompletionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regeneratorRuntimeStrings {
  
  @scala.inline
  def break: break = "break".asInstanceOf[break]
  
  @scala.inline
  def continue: continue = "continue".asInstanceOf[continue]
  
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @scala.inline
  def next: next = "next".asInstanceOf[next]
  
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  
  @scala.inline
  def `return`: `return` = "return".asInstanceOf[`return`]
  
  @scala.inline
  def root: root = "root".asInstanceOf[root]
  
  @scala.inline
  def `throw`: `throw` = "throw".asInstanceOf[`throw`]
  
  @js.native
  sealed trait break extends CompletionType
  
  @js.native
  sealed trait continue extends CompletionType
  
  @js.native
  sealed trait end extends js.Object
  
  @js.native
  sealed trait next extends js.Object
  
  @js.native
  sealed trait normal extends CompletionType
  
  @js.native
  sealed trait `return` extends CompletionType
  
  @js.native
  sealed trait root extends js.Object
  
  @js.native
  sealed trait `throw` extends CompletionType
}
