organization := "org.scalablytyped"
name := "semantic-ui-react"
version := "0.88.2-43c212"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-32adec",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-bfe2c5",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-73a5bc",
  "org.scalablytyped" %%% "stardust-ui__react-component-ref" % "0.38.0-81b0ad",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        