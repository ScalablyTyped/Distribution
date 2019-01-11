package typings
package scryptLib.scryptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scrypt", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def hash(
    key: java.lang.String,
    params: scryptLib.scryptMod.Params,
    outputLength: scala.Double,
    salt: java.lang.String
  ): js.Promise[nodeLib.Buffer] = js.native
  def hash(
    key: java.lang.String,
    params: scryptLib.scryptMod.Params,
    outputLength: scala.Double,
    salt: java.lang.String,
    cb: js.Function2[/* err */ nodeLib.Error | scala.Null, /* obj */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def hash(
    key: java.lang.String,
    params: scryptLib.scryptMod.Params,
    outputLength: scala.Double,
    salt: nodeLib.Buffer
  ): js.Promise[nodeLib.Buffer] = js.native
  def hash(
    key: java.lang.String,
    params: scryptLib.scryptMod.Params,
    outputLength: scala.Double,
    salt: nodeLib.Buffer,
    cb: js.Function2[/* err */ nodeLib.Error | scala.Null, /* obj */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def hash(
    key: nodeLib.Buffer,
    params: scryptLib.scryptMod.Params,
    outputLength: scala.Double,
    salt: java.lang.String
  ): js.Promise[nodeLib.Buffer] = js.native
  def hash(
    key: nodeLib.Buffer,
    params: scryptLib.scryptMod.Params,
    outputLength: scala.Double,
    salt: java.lang.String,
    cb: js.Function2[/* err */ nodeLib.Error | scala.Null, /* obj */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def hash(
    key: nodeLib.Buffer,
    params: scryptLib.scryptMod.Params,
    outputLength: scala.Double,
    salt: nodeLib.Buffer
  ): js.Promise[nodeLib.Buffer] = js.native
  def hash(
    key: nodeLib.Buffer,
    params: scryptLib.scryptMod.Params,
    outputLength: scala.Double,
    salt: nodeLib.Buffer,
    cb: js.Function2[/* err */ nodeLib.Error | scala.Null, /* obj */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def hashSync(
    key: java.lang.String,
    params: scryptLib.scryptMod.Params,
    outputLength: scala.Double,
    salt: java.lang.String
  ): nodeLib.Buffer = js.native
  def hashSync(
    key: java.lang.String,
    params: scryptLib.scryptMod.Params,
    outputLength: scala.Double,
    salt: nodeLib.Buffer
  ): nodeLib.Buffer = js.native
  def hashSync(
    key: nodeLib.Buffer,
    params: scryptLib.scryptMod.Params,
    outputLength: scala.Double,
    salt: java.lang.String
  ): nodeLib.Buffer = js.native
  def hashSync(
    key: nodeLib.Buffer,
    params: scryptLib.scryptMod.Params,
    outputLength: scala.Double,
    salt: nodeLib.Buffer
  ): nodeLib.Buffer = js.native
  def kdf(key: java.lang.String, paramsObject: scryptLib.scryptMod.Params): js.Promise[nodeLib.Buffer] = js.native
  def kdf(
    key: java.lang.String,
    paramsObject: scryptLib.scryptMod.Params,
    cb: js.Function2[/* err */ nodeLib.Error | scala.Null, /* obj */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def kdf(key: nodeLib.Buffer, paramsObject: scryptLib.scryptMod.Params): js.Promise[nodeLib.Buffer] = js.native
  def kdf(
    key: nodeLib.Buffer,
    paramsObject: scryptLib.scryptMod.Params,
    cb: js.Function2[/* err */ nodeLib.Error | scala.Null, /* obj */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def kdfSync(key: java.lang.String, paramsObject: scryptLib.scryptMod.Params): nodeLib.Buffer = js.native
  def kdfSync(key: nodeLib.Buffer, paramsObject: scryptLib.scryptMod.Params): nodeLib.Buffer = js.native
  def params(maxtime: scala.Double): js.Promise[scryptLib.scryptMod.Params] = js.native
  def params(
    maxtime: scala.Double,
    cb: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* obj */ scryptLib.scryptMod.Params, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def params(maxtime: scala.Double, maxmem: scala.Double): js.Promise[scryptLib.scryptMod.Params] = js.native
  def params(
    maxtime: scala.Double,
    maxmem: scala.Double,
    cb: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* obj */ scryptLib.scryptMod.Params, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def params(maxtime: scala.Double, maxmem: scala.Double, maxmemfrac: scala.Double): js.Promise[scryptLib.scryptMod.Params] = js.native
  def params(
    maxtime: scala.Double,
    maxmem: scala.Double,
    maxmemfrac: scala.Double,
    cb: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* obj */ scryptLib.scryptMod.Params, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def paramsSync(maxtime: scala.Double): scryptLib.scryptMod.Params = js.native
  def paramsSync(maxtime: scala.Double, maxmem: scala.Double): scryptLib.scryptMod.Params = js.native
  def paramsSync(maxtime: scala.Double, maxmem: scala.Double, maxmemfrac: scala.Double): scryptLib.scryptMod.Params = js.native
  def verifyKdf(kdf: nodeLib.Buffer, key: java.lang.String): js.Promise[scala.Boolean] = js.native
  def verifyKdf(
    kdf: nodeLib.Buffer,
    key: java.lang.String,
    cb: js.Function2[/* err */ nodeLib.Error | scala.Null, /* obj */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def verifyKdf(kdf: nodeLib.Buffer, key: nodeLib.Buffer): js.Promise[scala.Boolean] = js.native
  def verifyKdf(
    kdf: nodeLib.Buffer,
    key: nodeLib.Buffer,
    cb: js.Function2[/* err */ nodeLib.Error | scala.Null, /* obj */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def verifyKdfSync(kdf: nodeLib.Buffer, key: java.lang.String): scala.Boolean = js.native
  def verifyKdfSync(kdf: nodeLib.Buffer, key: nodeLib.Buffer): scala.Boolean = js.native
}

