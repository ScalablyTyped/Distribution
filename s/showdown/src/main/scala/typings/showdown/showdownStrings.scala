package typings.showdown

import typings.showdown.showdownMod.Flavor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object showdownStrings {
  @js.native
  sealed trait allOn extends Flavor
  
  @js.native
  sealed trait boolean extends js.Object
  
  @js.native
  sealed trait ghost extends Flavor
  
  @js.native
  sealed trait github extends Flavor
  
  @js.native
  sealed trait integer extends js.Object
  
  @js.native
  sealed trait original extends Flavor
  
  @js.native
  sealed trait string extends js.Object
  
  @js.native
  sealed trait vanilla extends Flavor
  
  @scala.inline
  def allOn: allOn = "allOn".asInstanceOf[allOn]
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  @scala.inline
  def ghost: ghost = "ghost".asInstanceOf[ghost]
  @scala.inline
  def github: github = "github".asInstanceOf[github]
  @scala.inline
  def integer: integer = "integer".asInstanceOf[integer]
  @scala.inline
  def original: original = "original".asInstanceOf[original]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def vanilla: vanilla = "vanilla".asInstanceOf[vanilla]
}

