package typings.pulsarClient

import typings.pulsarClient.mod.CompressionType
import typings.pulsarClient.mod.HashingScheme
import typings.pulsarClient.mod.MessageRoutingModes
import typings.pulsarClient.mod.SubscriptionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pulsarClientStrings {
  
  @js.native
  sealed trait BoostHash
    extends StObject
       with HashingScheme
  inline def BoostHash: BoostHash = "BoostHash".asInstanceOf[BoostHash]
  
  @js.native
  sealed trait CustomPartition
    extends StObject
       with MessageRoutingModes
  inline def CustomPartition: CustomPartition = "CustomPartition".asInstanceOf[CustomPartition]
  
  @js.native
  sealed trait Exclusive
    extends StObject
       with SubscriptionType
  inline def Exclusive: Exclusive = "Exclusive".asInstanceOf[Exclusive]
  
  @js.native
  sealed trait Failover
    extends StObject
       with SubscriptionType
  inline def Failover: Failover = "Failover".asInstanceOf[Failover]
  
  @js.native
  sealed trait JavaStringHash
    extends StObject
       with HashingScheme
  inline def JavaStringHash: JavaStringHash = "JavaStringHash".asInstanceOf[JavaStringHash]
  
  @js.native
  sealed trait KeyShared
    extends StObject
       with SubscriptionType
  inline def KeyShared: KeyShared = "KeyShared".asInstanceOf[KeyShared]
  
  @js.native
  sealed trait LZ4
    extends StObject
       with CompressionType
  inline def LZ4: LZ4 = "LZ4".asInstanceOf[LZ4]
  
  @js.native
  sealed trait Murmur3_32Hash
    extends StObject
       with HashingScheme
  inline def Murmur3_32Hash: Murmur3_32Hash = "Murmur3_32Hash".asInstanceOf[Murmur3_32Hash]
  
  @js.native
  sealed trait RoundRobinPartition
    extends StObject
       with MessageRoutingModes
  inline def RoundRobinPartition: RoundRobinPartition = "RoundRobinPartition".asInstanceOf[RoundRobinPartition]
  
  @js.native
  sealed trait Shared
    extends StObject
       with SubscriptionType
  inline def Shared: Shared = "Shared".asInstanceOf[Shared]
  
  @js.native
  sealed trait SinglePartition
    extends StObject
       with MessageRoutingModes
  inline def SinglePartition: SinglePartition = "SinglePartition".asInstanceOf[SinglePartition]
  
  @js.native
  sealed trait Zlib
    extends StObject
       with CompressionType
  inline def Zlib: Zlib = "Zlib".asInstanceOf[Zlib]
}
