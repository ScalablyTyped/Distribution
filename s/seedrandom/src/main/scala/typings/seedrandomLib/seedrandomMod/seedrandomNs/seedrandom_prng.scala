package typings
package seedrandomLib.seedrandomMod.seedrandomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait seedrandom_prng extends js.Object {
  def apply(): prng = js.native
  def apply(seed: java.lang.String): prng = js.native
  def apply(seed: java.lang.String, options: seedRandomOptions): prng = js.native
  def apply(seed: java.lang.String, options: seedRandomOptions, callback: js.Any): prng = js.native
  def alea(): prng = js.native
  def alea(seed: java.lang.String): prng = js.native
  def alea(seed: java.lang.String, options: seedRandomOptions): prng = js.native
  def alea(seed: java.lang.String, options: seedRandomOptions, callback: seedrandomCallback): prng = js.native
  def quick(): prng = js.native
  def quick(seed: java.lang.String): prng = js.native
  def quick(seed: java.lang.String, options: seedRandomOptions): prng = js.native
  def quick(seed: java.lang.String, options: seedRandomOptions, callback: seedrandomCallback): prng = js.native
  def tychei(): prng = js.native
  def tychei(seed: java.lang.String): prng = js.native
  def tychei(seed: java.lang.String, options: seedRandomOptions): prng = js.native
  def tychei(seed: java.lang.String, options: seedRandomOptions, callback: seedrandomCallback): prng = js.native
  def xor128(): prng = js.native
  def xor128(seed: java.lang.String): prng = js.native
  def xor128(seed: java.lang.String, options: seedRandomOptions): prng = js.native
  def xor128(seed: java.lang.String, options: seedRandomOptions, callback: seedrandomCallback): prng = js.native
  def xor4096(): prng = js.native
  def xor4096(seed: java.lang.String): prng = js.native
  def xor4096(seed: java.lang.String, options: seedRandomOptions): prng = js.native
  def xor4096(seed: java.lang.String, options: seedRandomOptions, callback: seedrandomCallback): prng = js.native
  def xorshift7(): prng = js.native
  def xorshift7(seed: java.lang.String): prng = js.native
  def xorshift7(seed: java.lang.String, options: seedRandomOptions): prng = js.native
  def xorshift7(seed: java.lang.String, options: seedRandomOptions, callback: seedrandomCallback): prng = js.native
  def xorwow(): prng = js.native
  def xorwow(seed: java.lang.String): prng = js.native
  def xorwow(seed: java.lang.String, options: seedRandomOptions): prng = js.native
  def xorwow(seed: java.lang.String, options: seedRandomOptions, callback: seedrandomCallback): prng = js.native
}

