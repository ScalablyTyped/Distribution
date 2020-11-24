package typings.stellarBase.xdrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object xdr {
  
  type AccountId = typings.stellarBase.xdrMod.xdr.PublicKey
  
  type Int64 = typings.stellarBase.xdrMod.xdr.Hyper
  
  type NodeId = typings.stellarBase.xdrMod.xdr.PublicKey
  
  type SequenceNumber = typings.stellarBase.xdrMod.xdr.Int64
  
  type SponsorshipDescriptor = js.UndefOr[typings.stellarBase.xdrMod.xdr.AccountId]
  
  type TimePoint = typings.stellarBase.xdrMod.xdr.Uint64
  
  type Uint64 = typings.stellarBase.xdrMod.xdr.UnsignedHyper
  
  type VarOpaque = typings.stellarBase.xdrMod.xdr.Opaque
}
