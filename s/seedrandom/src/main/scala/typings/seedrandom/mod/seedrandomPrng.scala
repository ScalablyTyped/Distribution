package typings.seedrandom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait seedrandomPrng extends js.Object {
  
  def apply(): prng = js.native
  def apply(seed: js.UndefOr[scala.Nothing], options: js.UndefOr[scala.Nothing], callback: seedrandomCallback): prng = js.native
  def apply(seed: js.UndefOr[scala.Nothing], options: seedRandomOptions): prng = js.native
  def apply(seed: js.UndefOr[scala.Nothing], options: seedRandomOptions, callback: seedrandomCallback): prng = js.native
  def apply(seed: String): prng = js.native
  def apply(seed: String, options: js.UndefOr[scala.Nothing], callback: seedrandomCallback): prng = js.native
  def apply(seed: String, options: seedRandomOptions): prng = js.native
  def apply(seed: String, options: seedRandomOptions, callback: seedrandomCallback): prng = js.native
  
  def alea(): prng = js.native
  def alea(seed: js.UndefOr[scala.Nothing], options: seedRandomOptions): prng = js.native
  def alea(seed: String): prng = js.native
  def alea(seed: String, options: seedRandomOptions): prng = js.native
  
  def quick(): prng = js.native
  def quick(seed: js.UndefOr[scala.Nothing], options: seedRandomOptions): prng = js.native
  def quick(seed: String): prng = js.native
  def quick(seed: String, options: seedRandomOptions): prng = js.native
  
  def tychei(): prng = js.native
  def tychei(seed: js.UndefOr[scala.Nothing], options: seedRandomOptions): prng = js.native
  def tychei(seed: String): prng = js.native
  def tychei(seed: String, options: seedRandomOptions): prng = js.native
  
  def xor128(): prng = js.native
  def xor128(seed: js.UndefOr[scala.Nothing], options: seedRandomOptions): prng = js.native
  def xor128(seed: String): prng = js.native
  def xor128(seed: String, options: seedRandomOptions): prng = js.native
  
  def xor4096(): prng = js.native
  def xor4096(seed: js.UndefOr[scala.Nothing], options: seedRandomOptions): prng = js.native
  def xor4096(seed: String): prng = js.native
  def xor4096(seed: String, options: seedRandomOptions): prng = js.native
  
  def xorshift7(): prng = js.native
  def xorshift7(seed: js.UndefOr[scala.Nothing], options: seedRandomOptions): prng = js.native
  def xorshift7(seed: String): prng = js.native
  def xorshift7(seed: String, options: seedRandomOptions): prng = js.native
  
  def xorwow(): prng = js.native
  def xorwow(seed: js.UndefOr[scala.Nothing], options: seedRandomOptions): prng = js.native
  def xorwow(seed: String): prng = js.native
  def xorwow(seed: String, options: seedRandomOptions): prng = js.native
}
