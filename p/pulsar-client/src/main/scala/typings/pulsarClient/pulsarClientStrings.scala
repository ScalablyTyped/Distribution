package typings.pulsarClient

import typings.pulsarClient.mod.CompressionType
import typings.pulsarClient.mod.ConsumerCryptoFailureAction
import typings.pulsarClient.mod.HashingScheme
import typings.pulsarClient.mod.InitialPosition
import typings.pulsarClient.mod.MessageRoutingMode
import typings.pulsarClient.mod.ProducerCryptoFailureAction
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
  sealed trait CONSUME
    extends StObject
       with ConsumerCryptoFailureAction
  inline def CONSUME: CONSUME = "CONSUME".asInstanceOf[CONSUME]
  
  @js.native
  sealed trait CustomPartition
    extends StObject
       with MessageRoutingMode
  inline def CustomPartition: CustomPartition = "CustomPartition".asInstanceOf[CustomPartition]
  
  @js.native
  sealed trait DISCARD
    extends StObject
       with ConsumerCryptoFailureAction
  inline def DISCARD: DISCARD = "DISCARD".asInstanceOf[DISCARD]
  
  @js.native
  sealed trait Earliest
    extends StObject
       with InitialPosition
  inline def Earliest: Earliest = "Earliest".asInstanceOf[Earliest]
  
  @js.native
  sealed trait Exclusive
    extends StObject
       with SubscriptionType
  inline def Exclusive: Exclusive = "Exclusive".asInstanceOf[Exclusive]
  
  @js.native
  sealed trait FAIL
    extends StObject
       with ConsumerCryptoFailureAction
       with ProducerCryptoFailureAction
  inline def FAIL: FAIL = "FAIL".asInstanceOf[FAIL]
  
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
  sealed trait Latest
    extends StObject
       with InitialPosition
  inline def Latest: Latest = "Latest".asInstanceOf[Latest]
  
  @js.native
  sealed trait Murmur3_32Hash
    extends StObject
       with HashingScheme
  inline def Murmur3_32Hash: Murmur3_32Hash = "Murmur3_32Hash".asInstanceOf[Murmur3_32Hash]
  
  @js.native
  sealed trait RoundRobinDistribution
    extends StObject
       with MessageRoutingMode
  inline def RoundRobinDistribution: RoundRobinDistribution = "RoundRobinDistribution".asInstanceOf[RoundRobinDistribution]
  
  @js.native
  sealed trait SEND
    extends StObject
       with ProducerCryptoFailureAction
  inline def SEND: SEND = "SEND".asInstanceOf[SEND]
  
  @js.native
  sealed trait SNAPPY
    extends StObject
       with CompressionType
  inline def SNAPPY: SNAPPY = "SNAPPY".asInstanceOf[SNAPPY]
  
  @js.native
  sealed trait Shared
    extends StObject
       with SubscriptionType
  inline def Shared: Shared = "Shared".asInstanceOf[Shared]
  
  @js.native
  sealed trait UseSinglePartition
    extends StObject
       with MessageRoutingMode
  inline def UseSinglePartition: UseSinglePartition = "UseSinglePartition".asInstanceOf[UseSinglePartition]
  
  @js.native
  sealed trait ZSTD
    extends StObject
       with CompressionType
  inline def ZSTD: ZSTD = "ZSTD".asInstanceOf[ZSTD]
  
  @js.native
  sealed trait Zlib
    extends StObject
       with CompressionType
  inline def Zlib: Zlib = "Zlib".asInstanceOf[Zlib]
}
