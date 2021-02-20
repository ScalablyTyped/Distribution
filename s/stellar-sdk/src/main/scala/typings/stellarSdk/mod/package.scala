package typings.stellarSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def default: js.Any = typings.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("default").asInstanceOf[js.Any]
  
  @scala.inline
  def AuthImmutableFlag: typings.stellarSdk.stellarSdkNumbers.`4` = typings.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("AuthImmutableFlag").asInstanceOf[typings.stellarSdk.stellarSdkNumbers.`4`]
  
  @scala.inline
  def AuthRequiredFlag: typings.stellarSdk.stellarSdkNumbers.`1` = typings.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("AuthRequiredFlag").asInstanceOf[typings.stellarSdk.stellarSdkNumbers.`1`]
  
  @scala.inline
  def AuthRevocableFlag: typings.stellarSdk.stellarSdkNumbers.`2` = typings.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("AuthRevocableFlag").asInstanceOf[typings.stellarSdk.stellarSdkNumbers.`2`]
  
  @scala.inline
  def BASE_FEE: /* "100" */ java.lang.String = typings.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("BASE_FEE").asInstanceOf[/* "100" */ java.lang.String]
  
  @scala.inline
  def FEDERATION_RESPONSE_MAX_SIZE: scala.Double = typings.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("FEDERATION_RESPONSE_MAX_SIZE").asInstanceOf[scala.Double]
  
  @scala.inline
  def FastSigning: scala.Boolean = typings.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("FastSigning").asInstanceOf[scala.Boolean]
  
  @scala.inline
  def HorizonAxiosClient: typings.axios.mod.AxiosInstance = typings.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("HorizonAxiosClient").asInstanceOf[typings.axios.mod.AxiosInstance]
  
  @scala.inline
  def MemoHash: /* "hash" */ java.lang.String = typings.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("MemoHash").asInstanceOf[/* "hash" */ java.lang.String]
  
  @scala.inline
  def MemoID: /* "id" */ java.lang.String = typings.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("MemoID").asInstanceOf[/* "id" */ java.lang.String]
  
  @scala.inline
  def MemoNone: /* "none" */ java.lang.String = typings.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("MemoNone").asInstanceOf[/* "none" */ java.lang.String]
  
  @scala.inline
  def MemoReturn: /* "return" */ java.lang.String = typings.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("MemoReturn").asInstanceOf[/* "return" */ java.lang.String]
  
  @scala.inline
  def MemoText: /* "text" */ java.lang.String = typings.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("MemoText").asInstanceOf[/* "text" */ java.lang.String]
  
  @scala.inline
  def SERVER_TIME_MAP: typings.std.Record[java.lang.String, typings.stellarSdk.horizonAxiosClientMod.ServerTime] = typings.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SERVER_TIME_MAP").asInstanceOf[typings.std.Record[java.lang.String, typings.stellarSdk.horizonAxiosClientMod.ServerTime]]
  
  @scala.inline
  def STELLAR_TOML_MAX_SIZE: scala.Double = typings.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("STELLAR_TOML_MAX_SIZE").asInstanceOf[scala.Double]
  
  @scala.inline
  def TimeoutInfinite: /* 0 */ scala.Double = typings.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("TimeoutInfinite").asInstanceOf[/* 0 */ scala.Double]
  
  @scala.inline
  def getCurrentServerTime(hostname: java.lang.String): scala.Double | scala.Null = typings.stellarSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentServerTime")(hostname.asInstanceOf[js.Any]).asInstanceOf[scala.Double | scala.Null]
  
  @scala.inline
  def hash(data: typings.node.Buffer): typings.node.Buffer = typings.stellarSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hash")(data.asInstanceOf[js.Any]).asInstanceOf[typings.node.Buffer]
  
  @scala.inline
  def sign(data: typings.node.Buffer, rawSecret: typings.node.Buffer): typings.node.Buffer = (typings.stellarSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(data.asInstanceOf[js.Any], rawSecret.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
  
  @scala.inline
  def verify(data: typings.node.Buffer, signature: typings.node.Buffer, rawPublicKey: typings.node.Buffer): scala.Boolean = (typings.stellarSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(data.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], rawPublicKey.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def version: js.Any = typings.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[js.Any]
}
