package typings.reactKawaii

import typings.reactKawaii.mod.KawaiiMood
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactKawaiiStrings {
  
  @scala.inline
  def blissful: blissful = "blissful".asInstanceOf[blissful]
  
  @scala.inline
  def excited: excited = "excited".asInstanceOf[excited]
  
  @scala.inline
  def happy: happy = "happy".asInstanceOf[happy]
  
  @scala.inline
  def ko: ko = "ko".asInstanceOf[ko]
  
  @scala.inline
  def lovestruck: lovestruck = "lovestruck".asInstanceOf[lovestruck]
  
  @scala.inline
  def sad: sad = "sad".asInstanceOf[sad]
  
  @scala.inline
  def shocked: shocked = "shocked".asInstanceOf[shocked]
  
  @js.native
  sealed trait blissful extends KawaiiMood
  
  @js.native
  sealed trait excited extends KawaiiMood
  
  @js.native
  sealed trait happy extends KawaiiMood
  
  @js.native
  sealed trait ko extends KawaiiMood
  
  @js.native
  sealed trait lovestruck extends KawaiiMood
  
  @js.native
  sealed trait sad extends KawaiiMood
  
  @js.native
  sealed trait shocked extends KawaiiMood
}
