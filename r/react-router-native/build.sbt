organization := "org.scalablytyped"
name := "react-router-native"
version := "4.2-dt-20190212Z-3b8a61"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-908b0a",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190322Z-ca8852",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-e0e6aa",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190429Z-aae4f0",
  "org.scalablytyped" %%% "react-router" % "4.4-dt-20190228Z-73dcd2",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        