organization := "org.scalablytyped"
name := "sc-broker"
version := "8.0-dt-20200519Z-29338f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-9d5717",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-23e0ed",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20200205Z-fce4c6",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
