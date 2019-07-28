package typings.seedrandom.seedrandomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait seedrandom_prng extends js.Object {
  def apply(): prng = js.native
  def apply(seed: String): prng = js.native
  def apply(seed: String, options: seedRandomOptions): prng = js.native
  def apply(seed: String, options: seedRandomOptions, callback: seedrandomCallback): prng = js.native
  def alea(): prng = js.native
  def alea(seed: String): prng = js.native
  def alea(seed: String, options: seedRandomOptions): prng = js.native
  def quick(): prng = js.native
  def quick(seed: String): prng = js.native
  def quick(seed: String, options: seedRandomOptions): prng = js.native
  def tychei(): prng = js.native
  def tychei(seed: String): prng = js.native
  def tychei(seed: String, options: seedRandomOptions): prng = js.native
  def xor128(): prng = js.native
  def xor128(seed: String): prng = js.native
  def xor128(seed: String, options: seedRandomOptions): prng = js.native
  def xor4096(): prng = js.native
  def xor4096(seed: String): prng = js.native
  def xor4096(seed: String, options: seedRandomOptions): prng = js.native
  def xorshift7(): prng = js.native
  def xorshift7(seed: String): prng = js.native
  def xorshift7(seed: String, options: seedRandomOptions): prng = js.native
  def xorwow(): prng = js.native
  def xorwow(seed: String): prng = js.native
  def xorwow(seed: String, options: seedRandomOptions): prng = js.native
}

