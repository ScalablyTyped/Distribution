organization := "org.scalablytyped"
name := "react-motion-ui-pack"
version := "0.10-dt-20190212Z-ad2959"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.4-a0e5c1",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-b94c72",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190528Z-1cea03",
  "org.scalablytyped" %%% "react-motion" % "0.0-unknown-dt-20190509Z-50e3c5",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        